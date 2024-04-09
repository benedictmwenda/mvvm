package net.ezra.ui.home

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.R
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.ui.services.Services

@Composable
fun HomeScreen(navController: NavHostController){
LazyColumn(
modifier = Modifier
.fillMaxSize()
) {
    item {
        Box(modifier = Modifier
            .fillMaxSize(),
        ){
            Image(painter = painterResource
                (id = R.drawable.gian),
                contentDescription = "Impala Shop",
                modifier = Modifier
                    .fillMaxSize()
//                .clip(CircleShape)
                ,
                contentScale = ContentScale.Fit
            )

            Column(
//                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
            ) {

                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.Cyan)
                ) {
                    Image(imageVector = Icons.Default.Home, contentDescription = "", colorFilter = ColorFilter.tint(Color.White))
                    Text ("IMPALA SHOPPING MALL ",color = Color.Black, textAlign = TextAlign.Justify)
                    Image(imageVector = Icons.Default.Menu, contentDescription = "")
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxSize()
                ) {

                    Button(
                        onClick = {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        },
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                        border = BorderStroke(1.5.dp, Color.LightGray),
                        contentPadding = PaddingValues(15.dp),
                        modifier = Modifier
                            .height(50.dp)
                            .width(150.dp)
                    ){
                        Image(imageVector = Icons.Default.Home, contentDescription = "")

                        Text("Hotels", color = Color(0xffFFB810))
                    }




                    Button(
                        onClick = {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        },
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                        border = BorderStroke(1.5.dp, Color.LightGray),
                        contentPadding = PaddingValues(15.dp),
                        modifier = Modifier
                            .height(50.dp)
                            .width(150.dp)

                    ){
                        Image(imageVector = Icons.Default.Home, contentDescription = "")
                        Text("Holiday", color = Color.Black)
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxSize()
                ) {

                    Button(
                        onClick = {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        },
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                        border = BorderStroke(1.5.dp, Color.LightGray),
                        modifier = Modifier
                            .height(50.dp)
                            .width(150.dp)
                    ){
                        Image(imageVector = Icons.Default.Home, contentDescription = "")
                        Text("Taxi", color = Color.Black)
                    }




                    Button(
                        onClick = {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        },
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                        border = BorderStroke(1.5.dp, Color.LightGray),
                        modifier = Modifier
                            .height(50.dp)
                            .width(150.dp)
                    ){
                        Image(imageVector = Icons.Default.Home, contentDescription = "")
                        Text("Ticket", color = Color.Black)
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxSize()
                ) {

                    Button(
                        onClick = {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        },
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                        border = BorderStroke(1.5.dp, Color.LightGray),
                        modifier = Modifier
                            .height(50.dp)
                            .width(150.dp)
                    ){
                        Image(imageVector = Icons.Default.Home, contentDescription = "")
                        Text("Airplane", color = Color.Black)
                    }




                    Button(
                        onClick = {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        },
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                        border = BorderStroke(1.5.dp, Color.LightGray),
                        modifier = Modifier
                            .height(50.dp)
                            .width(150.dp)
                    ){
                        Image(imageVector = Icons.Default.Home, contentDescription = "")
                        Text("Harbour", color = Color.Black)
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    horizontalArrangement = Arrangement.Absolute.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(text = "Popular in Town", textAlign = TextAlign.Justify)

                    Text(text = "View all", color = Color.Blue, textAlign = TextAlign.End)
                }
                Spacer(modifier = Modifier.height(20.dp))

                Row() {

                    Card(
                        elevation = CardDefaults.cardElevation(100.dp),
                        border = BorderStroke(1.5.dp, color = Color.Black),
                        modifier = Modifier
                            .padding(10.dp)
                            .size(150.dp)


                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.impala),
                            contentDescription = "Nusa Penida"
                        )
                        Row(
                            modifier = Modifier
                                .padding(0.dp)
                        ) {
                            Text(text = "Nusa Penida")
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Card(
                        elevation = CardDefaults.cardElevation(100.dp),
                        border = BorderStroke(1.5.dp, color = Color.Black),
                        modifier = Modifier
                            .padding(10.dp)
                            .size(150.dp)

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.impala),
                            contentDescription = "Tanah Lot"
                        )
                        Row(
                            modifier = Modifier
                                .padding(0.dp)
                        ) {
                            Text(text = "Tanah Lot")
                        }
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Row() {

                    Card(
                        elevation = CardDefaults.cardElevation(100.dp),
                        border = BorderStroke(1.5.dp, color = Color.Black),
                        modifier = Modifier
                            .padding(10.dp)
                            .size(150.dp)


                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.impala),
                            contentDescription = "Nusa Penida"
                        )
                        Row(
                            modifier = Modifier
                                .padding(0.dp)
                        ) {
                            Text(text = "Nusa Penida")
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Card(
                        elevation = CardDefaults.cardElevation(100.dp),
                        border = BorderStroke(1.5.dp, color = Color.Black),
                        modifier = Modifier
                            .padding(10.dp)
                            .size(150.dp)

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.impala),
                            contentDescription = "Tanah Lot"
                        )
                        Row(
                            modifier = Modifier
                                .padding(0.dp)
                        ) {
                            Text(text = "Tanah Lot")
                        }
                    }
                }
            }
        }
    }
}
}


@Preview(showBackground = true)
@Composable
fun PreviewLight() {
   HomeScreen(rememberNavController())
}