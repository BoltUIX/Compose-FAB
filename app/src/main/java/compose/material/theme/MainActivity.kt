package compose.material.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import compose.material.theme.ui.theme.Material3ComposeTheme



/*
*
* Get More gradient color
*https://stackoverflow.com/questions/69562201/gradient-backround-for-fab-in-jetpack-compose
*
* */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Material3ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {



                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        // Gap between children = 26 dp
                        verticalArrangement = Arrangement.spacedBy(26.dp, Alignment.CenterVertically),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        val cornerRadius = 14.dp
                        val gradientColors = listOf(Color(0xFF8E2DE2), Color(0xFF4A00E0))



                        GradientButtonMini(
                            gradientColors = gradientColors,
                            cornerRadius = cornerRadius,
                            "Gradient Button"
                        )

                        GradientButtonRegular(
                            gradientColors = gradientColors,
                            cornerRadius = cornerRadius,
                            "Gradient Button"
                        )
                        GradientButtonLarge(
                            gradientColors = gradientColors,
                            cornerRadius = cornerRadius,
                            "Gradient Button"
                        )


                        GradientButtonExtend(
                            gradientColors = gradientColors,
                            cornerRadius = cornerRadius,
                            "Gradient Button"
                        )



                    }



                }
            }
        }
    }
}

/*@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Material3ComposeTheme {
        Greeting("Android")
    }
}*/
//...........................................................................
@Composable
private fun GradientButtonMini(
    gradientColors: List<Color>,
    cornerRadius: Dp,
    nameButton: String
) {

    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 25.dp, end = 25.dp),
        onClick = {
                  //your code
        },
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        shape = RoundedCornerShape(cornerRadius)
    ) {


        Surface( shadowElevation = 12.dp, shape = RoundedCornerShape(12.dp)) {
            Box(
                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp)
                    .background(
                        brush = Brush.linearGradient(colors = gradientColors),
                        shape = RoundedCornerShape(cornerRadius)
                    )
                // .padding(horizontal = 16.dp, vertical = 8.dp)
                ,
                contentAlignment = Alignment.Center
            ) {
                Icon(Icons.Filled.Add,
                    tint = Color.White,
                    contentDescription = "Localized description")
                /* Text(
                     text = nameButton,
                     fontSize = 20.sp,
                     color = Color.White
                 )*/
            }
        }

    }
}

@Composable
private fun GradientButtonRegular(
    gradientColors: List<Color>,
    cornerRadius: Dp,
    nameButton: String
) {

    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 28.dp, end = 28.dp),
        onClick = {
            //your code
        },
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        shape = RoundedCornerShape(cornerRadius)
    ) {

        Surface( shadowElevation = 12.dp, shape = RoundedCornerShape(12.dp)) {
            Box(
                modifier = Modifier
                    .height(56.dp)
                    .width(56.dp)
                    .background(
                        brush = Brush.linearGradient(colors = gradientColors),
                        shape = RoundedCornerShape(cornerRadius)
                    )
                // .padding(horizontal = 16.dp, vertical = 8.dp)
                ,
                contentAlignment = Alignment.Center
            ) {
                Icon(Icons.Filled.Add,
                    tint = Color.White,
                    contentDescription = "Localized description")
                /* Text(
                     text = nameButton,
                     fontSize = 20.sp,
                     color = Color.White
                 )*/
            }
        }

    }
}


@Composable
private fun GradientButtonLarge(
    gradientColors: List<Color>,
    cornerRadius: Dp,
    nameButton: String
) {

    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 28.dp, end = 28.dp),
        onClick = {
            //your code
        },
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        shape = RoundedCornerShape(cornerRadius)
    ) {



        Surface( shadowElevation = 12.dp, shape = RoundedCornerShape(12.dp)) {
            Box(
                modifier = Modifier
                    .height(90.dp)
                    .width(90.dp)
                    .background(
                        brush = Brush.linearGradient(colors = gradientColors),
                        shape = RoundedCornerShape(cornerRadius),
                    )
                // .padding(horizontal = 16.dp, vertical = 8.dp)
                , contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id =R.drawable.plus),
                    tint = Color.White,
                    contentDescription = "Localized description")
            }
        }
    }

}


@Composable
private fun GradientButtonExtend(
    gradientColors: List<Color>,
    cornerRadius: Dp,
    nameButton: String
) {

    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 28.dp, end = 28.dp),
        onClick = {
            //your code
        },
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        shape = RoundedCornerShape(cornerRadius)
    ) {

        Surface( shadowElevation = 12.dp, shape = RoundedCornerShape(12.dp)) {
            Box(
                modifier = Modifier
                    .height(56.dp)
                    .wrapContentWidth()
                    //.width(56.dp)
                    .background(
                        brush = Brush.linearGradient(colors = gradientColors),
                        shape = RoundedCornerShape(cornerRadius)
                    )
               .padding(horizontal = 16.dp, vertical = 8.dp)
                ,
                contentAlignment = Alignment.Center
            ) {



                Row(
                    modifier = Modifier
                        .padding(5.dp)
                       // .verticalScroll(rememberScrollState())
                ) {
                    Icon(Icons.Filled.Add,
                        tint = Color.White,
                        contentDescription = "Localized description")
                    Text(
                        text = nameButton,
                        fontSize = 20.sp,
                        color = Color.White,
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }

            }
        }

    }
}



