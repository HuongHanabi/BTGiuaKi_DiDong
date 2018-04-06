package com.vuthidiemhuong.thcs_de1;


        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.Menu;
        import android.view.MenuInflater;
        import android.view.MenuItem;
        import android.widget.ListView;

        import java.util.ArrayList;

        import com.vuthidiemhuong.thcs_de1.DataSource.HocVienDataSource;
        import com.vuthidiemhuong.thcs_de1.Model.HocVien;

public class MainActivity extends AppCompatActivity {
    ListView listViewthuchi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewthuchi = (ListView) findViewById(R.id.lvthuchi);
        HocVienDataSource hocVienDataSource = new HocVienDataSource(MainActivity.this);
        ArrayList<HocVien> list = hocVienDataSource.LietKeHV();
        CustomAdapter adapter = new CustomAdapter(MainActivity.this,R.layout.row_list_layout,list);
        listViewthuchi.setAdapter(adapter);
    }

    @Override //goi menu ra
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override // set chuc nang cua no, co 3 chuc nang, them moi, luu, thongke, thoat
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.themmoi:
                Intent intent = new Intent(MainActivity.this,ThemMoiActivity.class);
                startActivity(intent);
                return true;
            case R.id.luu:

                return true;
            case R.id.thoat:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
