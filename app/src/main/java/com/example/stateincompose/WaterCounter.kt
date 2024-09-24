import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.stateincompose.TAG

@Composable
fun WaterCounter(modifier: Modifier = Modifier){
    Log.i(TAG, "Recomposing Box and Column")
    Box( modifier = modifier.padding(16.dp) ){
        ButtonAndCounter(modifier)
    }
}

@Composable
fun ButtonAndCounter(modifier: Modifier = Modifier){
    Column(modifier = modifier.padding(16.dp)) {
        Log.i(TAG, "Recomposing Column")
        var count by remember { mutableStateOf(0) }
        Text("You've had $count glasses.")
        Button(onClick = { count ++ }, Modifier.padding(top = 8.dp)) {
            Text("Add one")
        }
    }
}