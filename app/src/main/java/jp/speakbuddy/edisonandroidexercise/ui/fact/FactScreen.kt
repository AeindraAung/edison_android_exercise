package jp.speakbuddy.edisonandroidexercise.ui.fact

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import jp.speakbuddy.edisonandroidexercise.ui.theme.EdisonAndroidExerciseTheme

@Composable
fun FactScreen(
    viewModel: FactViewModel = hiltViewModel()
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(
            space = 16.dp,
            alignment = Alignment.CenterVertically
        )
    ) {
        val length by viewModel.lengthFlow.collectAsState(initial = "")

        Text(
            text = "Length",
            style = MaterialTheme.typography.titleLarge
        )

        Text(
            text = length,
            style = MaterialTheme.typography.bodyLarge
        )

        val onClick = {
            viewModel.updateLength { print("done") }
        }

        Button(onClick = onClick) {
            Text(text = "Update length")
        }
    }
}

@Preview
@Composable
private fun FactScreenPreview() {
    EdisonAndroidExerciseTheme {
        FactScreen()
    }
}
