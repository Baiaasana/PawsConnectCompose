package com.example.pawsconnectcompose.ui.onBoarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.pawsconnectcompose.R
import com.example.pawsconnectcompose.ui.customs.BlueButton
import com.example.pawsconnectcompose.ui.customs.BoldText
import com.example.pawsconnectcompose.ui.customs.RegularText
import com.example.pawsconnectcompose.ui.customs.SemiBoldText

@Composable
fun OnBoardingScreen(
    onSkipClick: () -> Unit?,
    onSignInClick: () -> Unit?,
    onSignUpClick: () -> Unit?
) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column(verticalArrangement = Arrangement.SpaceBetween) {
            Column(

            ) {
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
                                end = androidx.compose.ui.geometry.Offset(
                                    Float.POSITIVE_INFINITY,
                                    0f
                                )
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
                    BoldText(text = stringResource(id = R.string.welcome))
                    // Add a vertical space between the author and message texts
                    Spacer(modifier = Modifier.height(12.dp))
                    RegularText(text = stringResource(id = R.string.welcome_desc))
                }
            }

            Column(
                modifier = Modifier
                    .padding(horizontal = 28.dp)
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                BlueButton(onClick = onSignUpClick, text = stringResource(id = R.string.sign_up))
                Spacer(modifier = Modifier.height(12.dp))
                BlueButton(onClick = {
                    onSignInClick.invoke()
                }, text = stringResource(id = R.string.log_in))
                Spacer(modifier = Modifier.height(24.dp))
                SemiBoldText(text = stringResource(id = R.string.skip), onTextClick = onSkipClick)
            }
        }
    }
}


