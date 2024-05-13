package com.example.pawsconnectcompose.ui.customs

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.pawsconnectcompose.R

@Composable
fun BoldText(text: String) {
    Text(
        text = text,
        textAlign = TextAlign.Center,
        style = TextStyle(
            fontSize = 28.sp,
            fontFamily = FontFamily(Font(R.font.nunito_bold))
        ), modifier = Modifier
            .fillMaxWidth()
    )
}

@Composable
fun RegularText(text: String, textSize: TextUnit) {
    Text(
        text = text,
        textAlign = TextAlign.Center,
        style = TextStyle(
            fontSize = 16.sp,
            fontFamily = FontFamily(Font(R.font.nunito_regular))
        ), modifier = Modifier
            .fillMaxWidth()
    )
}

@Composable
fun SemiBoldText(text: String, onTextClick: () -> Unit?) {
    Text(
        modifier = Modifier.clickable(enabled = true, onClick = {onTextClick.invoke()}).fillMaxWidth(),
        text = text,
        textAlign = TextAlign.Center,
        color = colorResource(id = R.color.blue),
        style = TextStyle(
            fontSize = 16.sp,
            fontFamily = FontFamily(Font(R.font.nunito_semibold))
        )
    )
}