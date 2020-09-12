import android.os.Bundle;
import android.widget.ListView;

import com.example.dsc_rec.R;

import java.util.ArrayList;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HeadingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        String url = "https://wayhike.com/dsc/demo_app_api.php";

        ArrayList<heading> headings = (ArrayList<heading>) Query.fetchData(url);
        ListView headingListView = (ListView) findViewById(R.id.fragment_home);
        Adapter adapter =new Adapter (this, headingListView);


    }
}
