package com.adapter;

public class School {
    public static void main(String[] args) {
       // PilotPen pp = new PilotPen();
        Pen p = new PenAdapter();
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setP(p);
        assignmentWork.writeAssignment("I am tired to write assignment");
    }
}
