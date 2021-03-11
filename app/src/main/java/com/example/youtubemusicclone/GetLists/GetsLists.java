package com.example.youtubemusicclone.GetLists;

import com.example.youtubemusicclone.R;
import com.example.youtubemusicclone.recyclers.WorkoutModel;

import java.util.ArrayList;
import java.util.List;

public class GetsLists {
    public static List<WorkoutModel> getWorkoutItemList1() {
        List<WorkoutModel> workoutModelList1 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 4 == 0) {
                workoutModelList1.add(new WorkoutModel(R.drawable.workout1, "Workout SuperMix", "Imagine Dragons"));
            }
            if (i % 4 == 1) {
                workoutModelList1.add(new WorkoutModel(R.drawable.workout2, "Workout Mix 1 ", "Future Migos"));
            }
            if (i % 4 == 2) {
                workoutModelList1.add(new WorkoutModel(R.drawable.workout3, "Workout Mix 2", "21 pilots"));
            }
            if (i % 4 == 3) {
                workoutModelList1.add(new WorkoutModel(R.drawable.workout4, "WOrkout Mix 3", "DjHeartLess"));
            }

        }
        return workoutModelList1;
    }

    public static List<WorkoutModel> getWorkoutItemList2() {
        List<WorkoutModel> workoutModelList2 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 4 == 0) {
                workoutModelList2.add(new WorkoutModel(R.drawable.hiphop1, "HipHop mix", "Imagine Dragons"));
            }
            if (i % 4== 1) {
                workoutModelList2.add(new WorkoutModel(R.drawable.hiphop2, "HipHop  Mix 1 ", "Future Migos"));
            }
            if (i % 4 == 2) {
                workoutModelList2.add(new WorkoutModel(R.drawable.hiphop3, "HipHop Mix 2", "21 pilots"));
            }
            if (i % 4 == 3) {
                workoutModelList2.add(new WorkoutModel(R.drawable.hiphop4, "HipHop Mix 3", "DjHeartLess"));
            }

        }
        return workoutModelList2;

    }

    public static List<WorkoutModel> getWorkoutItemList3() {
        List<WorkoutModel> workoutModelList3 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 4 == 0) {
                workoutModelList3.add(new WorkoutModel(R.drawable.rock1, "rock superMix", "Imagine Dragons"));
            }
            if (i % 4 == 1) {
                workoutModelList3.add(new WorkoutModel(R.drawable.rock2, "rock  Mix 1 ", "Future Migos"));
            }
            if (i % 4 == 2) {
                workoutModelList3.add(new WorkoutModel(R.drawable.rock3, "rock Mix 2", "21 pilots"));
            }
            if (i % 4 == 3) {
                workoutModelList3.add(new WorkoutModel(R.drawable.rock4, "rock Mix 3", "DjHeartLess"));
            }

        }
        return workoutModelList3;
    }
    public static List<WorkoutModel> getWorkoutItemList4() {
        List<WorkoutModel> workoutModelList4= new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 4 == 0) {
                workoutModelList4.add(new WorkoutModel(R.drawable.yoga1, "yoga superMix", "Imagine Dragons"));
            }
            if (i % 4 == 1) {
                workoutModelList4.add(new WorkoutModel(R.drawable.yoga2, "yoga  Mix 1 ", "Future Migos"));
            }
            if (i % 4 == 2) {
                workoutModelList4.add(new WorkoutModel(R.drawable.yoga3, "yoga Mix 2", "21 pilots"));
            }
            if (i % 4 == 3) {
                workoutModelList4.add(new WorkoutModel(R.drawable.yoga4, "yoga Mix 3", "DjHeartLess"));
            }

        }
        return workoutModelList4;
    }
}