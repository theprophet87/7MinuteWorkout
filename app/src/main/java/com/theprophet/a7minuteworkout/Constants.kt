package com.theprophet.a7minuteworkout

object Constants {

    fun defaultExerciseList(): ArrayList<ExerciseModel>{

        //initialize arraylist
        val exerciseList = ArrayList<ExerciseModel>()

        //exercise variables
        val alternatingPunches = ExerciseModel(1, "Alternating Punches",
        R.drawable.ic_alt_punches, false, false)
        exerciseList.add(alternatingPunches)

        val highKnees = ExerciseModel(2, "High Knees",
            R.drawable.ic_high_knees, false, false)
        exerciseList.add(highKnees)

        val leftJabs = ExerciseModel(3, "Left Jab",
            R.drawable.ic_left_jab, false, false)
        exerciseList.add(leftJabs)

        val jumpingJacks = ExerciseModel(4, "Jumping Jacks",
            R.drawable.ic_jumping_jacks, false, false)
        exerciseList.add(jumpingJacks)

        val rightJabs = ExerciseModel(5, "Right Jabs",
            R.drawable.ic_right_jab, false, false)
        exerciseList.add(rightJabs)


        return exerciseList
    }
}