import java.util.LinkedList;
import java.util.List;

public class S207_CourseSchedule {
    public static void main(String[] args) {
        S207_CourseSchedule s207_courseSchedule = new S207_CourseSchedule();
        int[][] pre = new int[][]{
                {1, 0},
                {2, 6},
                {1, 7},
                {6, 4},
                {7, 0},
                {0, 5}
        };
//        int[][] pre = new int[][]{
//                {1, 0},
//                {1,2},
//                {0,1},
//        };
//        int[][] pre = new int[][]{
//                {1, 0},
//                {0,3},
//                {0,2},
//                {3,2},
//                {2,5},
//                {4,5},
//                {5,6},
//                {2,4}
//        };
        System.out.println(s207_courseSchedule.canFinish(8, pre));
    }

    class Course {
        public int curCourse;
        public List<Integer> preCourses;

        public Course(int curCourse) {
            this.curCourse = curCourse;
            preCourses = new LinkedList<>();
        }

        public void addPreCourse(int i) {
            this.preCourses.add(i);
        }
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Course[] courses = new Course[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];
            if (courses[a] == null) {
                courses[a] = new Course(a);
            }
            courses[a].addPreCourse(b);
        }
        for (int i = 0; i < numCourses; i++) {
            Course course = courses[i];
            if (course == null)
                continue;
            for (int c : course.preCourses) {
                boolean[] flag = new boolean[numCourses];
                flag[course.curCourse] = true;
                if (!dfs(flag, c, courses))
                    return false;
            }
        }
        return true;
    }

    public boolean dfs(boolean[] flag, int course, Course[] courses) {
        if (flag[course])
            return false;
        if (courses[course] == null)
            return true;
        flag[course] = true;
        for (int i : courses[course].preCourses) {
            if (courses[i] == null)
                continue;
            int c = courses[i].curCourse;
            if (!dfs(flag, c, courses))
                return false;
        }
        flag[course] = false;
        return true;
    }
}
