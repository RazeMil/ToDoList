package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvList;
    ArrayList<ToDoItem> alTodoItem;
    CustomAdapter caTodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvList = findViewById(R.id.listViewList);

        alTodoItem = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2018,7,1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2018,9,22);

        ToDoItem list1 = new ToDoItem("MSA",date1);
        ToDoItem list2 = new ToDoItem("Go for haircut",date2);

        alTodoItem.add(list1);
        alTodoItem.add(list2);

        caTodo = new CustomAdapter(this,R.layout.todo_item,alTodoItem);

        lvList.setAdapter(caTodo);


        }
    }

