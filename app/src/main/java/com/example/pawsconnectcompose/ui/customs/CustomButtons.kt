package com.example.pawsconnectcompose.ui.customs

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pawsconnectcompose.R

@Composable
fun BlueButton(
    onClick: () -> Unit?,
    text: String
) {
    Button(
        modifier = Modifier
            .width(180.dp)
            .height(48.dp),
        onClick = { onClick.invoke() },
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(id = R.color.blue),
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(16.dp)
    ) {
        Text(
            text = text,
            textAlign = TextAlign.Center,
            color = colorResource(id = R.color.white),
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.nunito_regular))
            ), modifier = Modifier
                .fillMaxWidth()
        )
    }
}