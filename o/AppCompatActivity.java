package o;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;

public interface AppCompatActivity {
    WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat);
}
