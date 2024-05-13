package com.example.pawsconnectcompose.ui.onBoarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pawsconnectcompose.R

@Composable
fun OnBoardingScreen(modifier: Modifier) {
    Surface(
        modifier = modifier
    ) {
        Column() {
            Box(
                modifier = Modifier
                    .height(362.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Color(0xFF4BA1F0),
                                Color(0xFF4BA1F0)
                            ),
                            start = androidx.compose.ui.geometry.Offset(
                                0f,
                                Float.POSITIVE_INFINITY
                            ),
                            end = androidx.compose.ui.geometry.Offset(Float.POSITIVE_INFINITY, 0f)
                        ),
                        shape = RoundedCornerShape(bottomEnd = 300.dp, bottomStart = 300.dp)
                    )
            ) {
                Image(
                    painter = painterResource(R.drawable.dog),
                    contentDescription = "Contact profile picture",
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.Center)
                )
            }
            Spacer(modifier = Modifier.height(40.dp))

            Column(
                modifier = Modifier.padding(horizontal = 28.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(id = R.string.welcome),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 28.sp,
                        fontFamily = FontFamily(Font(R.font.nunito_bold))
                    ), modifier = Modifier
                        .fillMaxWidth()
                )
                // Add a vertical space between the author and message texts
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    text = stringResource(id = R.string.welcome_desc),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.nunito_regular))
                    ), modifier = Modifier
                        .fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(104.dp))
                Button(
                    modifier = Modifier
                        .width(180.dp)
                        .height(48.dp),
                    onClick = { /* Handle button click */ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.blue),
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Text(
                        text = stringResource(id = R.string.sign_up),
                        textAlign = TextAlign.Center,
                        color = colorResource(id = R.color.white),
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.nunito_regular))
                        ), modifier = Modifier
                            .fillMaxWidth()
                    )
                }
                Spacer(modifier = Modifier.height(12.dp))
                Button(
                    modifier = Modifier
                        .width(180.dp)
                        .height(48.dp),
                    onClick = { /* Handle button click */ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.blue),
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Text(
                        text = stringResource(id = R.string.log_in),
                        textAlign = TextAlign.Center,
                        color = colorResource(id = R.color.white),
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.nunito_regular))
                        ), modifier = Modifier
                            .fillMaxWidth()
                    )
                }
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = stringResource(id = R.string.skip),
                    textAlign = TextAlign.Center,
                    color = colorResource(id = R.color.blue),
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.nunito_semibold))
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                )

            }
        }
    }
}