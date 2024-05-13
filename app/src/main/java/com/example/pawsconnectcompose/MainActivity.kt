package com.example.pawsconnectcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pawsconnectcompose.ui.explore.ExploreScreen
import com.example.pawsconnectcompose.ui.onBoarding.OnBoardingScreen
import com.example.pawsconnectcompose.ui.registration.RegistrationScreen
import com.example.pawsconnectcompose.ui.signInScreen.SignInScreen
import com.example.pawsconnectcompose.ui.theme.PawsConnectComposeTheme
import com.example.pawsconnectcompose.ui.utils.Routes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        enableEdgeToEdge()
        setContent {
            PawsConnectComposeTheme {

                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.White)
                ) {
                    val navController = rememberNavController()

                    NavHost(navController = navController, startDestination = Routes.ONBOARDING) {
                        composable(Routes.ONBOARDING) {
                            OnBoardingScreen(
                                onSkipClick = {
                                    navController.navigate(Routes.EXPLORE)
                                },

                                onSignInClick = {
                                    navController.navigate(Routes.REGISTRATION)
                                },

                                onSignUpClick = {
                                    navController.navigate(Routes.REGISTRATION)
                                }
                            )
                        }
                        composable(Routes.REGISTRATION) {
                            RegistrationScreen()
//                            navController.navigate(Routes.REGISTRATION)
                        }
                        composable(Routes.EXPLORE) {
                            ExploreScreen()
//                            navController.navigate(Routes.EXPLORE)
                        }
                        composable(Routes.SIGN_IN) {
                            SignInScreen()
//                            navController.navigate(Routes.EXPLORE)
                        }


                    }
                }
            }
        }
    }
}





