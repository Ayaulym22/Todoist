package com.example.notes.adapter;

import com.example.notes.model2.Task;
// interface to set position and task corresponding to the onClick action
public interface onTodoClickListener {
    void onTodoClick(Task task);
    void onTodoRadioButtonClick(Task task);
}
