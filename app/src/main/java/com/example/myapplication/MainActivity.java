package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Student> students;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        students = new ArrayList<>();

        // Danh sách sinh viên
        students.add(new Student("2311505312235", "Đoàn Xuân Song", "Công nghệ thông tin"));
        students.add(new Student("2311505312236", "Nguyễn Văn An", "Khoa học máy tính"));
        students.add(new Student("2311505312237", "Trần Thị Bình", "Kỹ thuật phần mềm"));
        students.add(new Student("2311505312238", "Lê Hoàng Cường", "Hệ thống thông tin"));
        students.add(new Student("2311505312239", "Phạm Thu Duyên", "Trí tuệ nhân tạo"));
        students.add(new Student("2311505312240", "Hoàng Minh Đức", "An toàn thông tin"));
        students.add(new Student("2311505312241", "Võ Thị Giang", "Công nghệ thông tin"));
        students.add(new Student("2311505312242", "Đặng Văn Hùng", "Khoa học dữ liệu"));
        students.add(new Student("2311505312243", "Bùi Thị Hương", "Kỹ thuật phần mềm"));
        students.add(new Student("2311505312244", "Ngô Văn Khánh", "Mạng máy tính"));
        students.add(new Student("2311505312245", "Trương Thị Lan", "Công nghệ thông tin"));
        students.add(new Student("2311505312246", "Phan Văn Minh", "Hệ thống thông tin"));
        students.add(new Student("2311505312247", "Dương Thị Nga", "Trí tuệ nhân tạo"));
        students.add(new Student("2311505312248", "Lý Văn Phong", "An toàn thông tin"));
        students.add(new Student("2311505312249", "Đinh Thị Quỳnh", "Khoa học máy tính"));
        students.add(new Student("2311505312250", "Vũ Văn Sơn", "Kỹ thuật phần mềm"));
        students.add(new Student("2311505312251", "Mai Thị Trang", "Công nghệ thông tin"));
        students.add(new Student("2311505312252", "Hồ Văn Tú", "Khoa học dữ liệu"));
        students.add(new Student("2311505312253", "Cao Thị Uyên", "Mạng máy tính"));
        students.add(new Student("2311505312254", "Lưu Văn Vinh", "Hệ thống thông tin"));

        adapter = new MyAdapter(students, this::showBottomPopup);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void showBottomPopup(Student student) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        View view = getLayoutInflater().inflate(R.layout.bottom_popup, null);

        TextView txtStudentId = view.findViewById(R.id.txtStudentId);
        TextView txtStudentName = view.findViewById(R.id.txtStudentName);
        TextView txtStudentMajor = view.findViewById(R.id.txtStudentMajor);

        txtStudentId.setText(student.getId());
        txtStudentName.setText(student.getName());
        txtStudentMajor.setText(student.getMajor());

        bottomSheetDialog.setContentView(view);
        bottomSheetDialog.show();
    }
}