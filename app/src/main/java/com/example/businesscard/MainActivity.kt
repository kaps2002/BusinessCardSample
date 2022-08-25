package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.R.drawable.*
import com.example.businesscard.ui.theme.BusinessCardTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard(
                        a="Karan Pandey",
                    b="Android Developer"
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(a:String,b:String) {
    Surface(
        color= Color(0xFF053D4E),
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),

    )
   {
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center,
//
//        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
                , modifier = Modifier.padding(top = 16.dp)
            ) {
                val image= Image(
                    painterResource(id = android),
                    contentDescription = null,
                    modifier = Modifier.size(200.dp)
                )
                Text(
                    text = a,
                    color = Color.White,
                    fontSize=36.sp,
                )
                Text(
                    text = b,
                    color = Color(0xFF3ddc84),
                    fontSize=20.sp,
                )
            }
            Column(
                verticalArrangement = Arrangement.Bottom,
//                horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(bottom = 16.dp)

            ) {
                Row(
//                    modifier =Modifier.padding(start = 16.dp, bottom = 16.dp),
                            modifier = Modifier.padding(start = 32.dp,bottom = 12.dp)
                ) {
                    val image= Image(
                        painter = painterResource(id =R.drawable.envelope_solid  ),
                        contentDescription =null ,
                        modifier=Modifier.size(24.dp)

                    )
                    Text(text = "123dfg@gmail.com",color = Color(0xFF3ddc84),
                        modifier = Modifier.padding(start = 60.dp),

                    )
                }

                Row(
                    modifier = Modifier.padding(start = 32.dp,bottom = 12.dp)

                ) {
                    val image= Image(
                        painter = painterResource(id =R.drawable.phone_solid  ),
                        contentDescription =null ,
                        modifier=Modifier.size(24.dp)

                    )
                    Text(text = "2345678765",color = Color(0xFF3ddc84),
                            modifier = Modifier.padding(start = 60.dp),


                    )
                }
                Row(
                    modifier = Modifier.padding(start = 32.dp,bottom = 12.dp)

                ) {
                    val image= Image(
                        painter = painterResource(id =R.drawable.share_nodes_solid  ),
                        contentDescription =null ,
                        modifier=Modifier.size(24.dp)
                    )
                    Text(text = "@Androiddev",color = Color(0xFF3ddc84),
                        modifier = Modifier.padding(start = 60.dp),


                    )
                }
            }
//        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCard(
            a="Karan Pandey",
            b="Android Developer"
        )
    }
}