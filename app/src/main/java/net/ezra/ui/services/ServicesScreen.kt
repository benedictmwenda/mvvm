package net.ezra.ui.services


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
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.R

@Composable
fun Services(navController: NavHostController) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        item {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
            ) {
                Image(painter = painterResource
                    (id = R.drawable.victor),
                    contentDescription = "Impala Shop",
                    modifier = Modifier
                        .fillMaxSize()
//                .clip(CircleShape)
                    ,
                    contentScale = ContentScale.Fit
                )
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.Transparent)
                ) {
                    Image(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = "", colorFilter = ColorFilter.tint(Color.White),
                        modifier = Modifier
                        .clickable {
                        navController.navigate(ROUTE_HOME) {
                            popUpTo(ROUTE_SERVICES) { inclusive = true }
                        }
                    }
                    )
                    Text ("IMPALA SHOPPING MALL ",color = Color.Black, textAlign = TextAlign.Justify)
                    Image(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                        modifier = Modifier
                            .clickable {
                                navController.navigate(ROUTE_MIT) {
                                    popUpTo(ROUTE_SERVICES) { inclusive = true }
                                }
                            }
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(5.dp),
                ) {

                    val search = LocalContext.current
                    Button(
                        onClick = {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        },
                        shape = RoundedCornerShape(20.dp),
                        colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                        border = BorderStroke(1.5.dp, Color.LightGray)
                    ){
                        Image(imageVector = Icons.Default.Search, contentDescription = "")
                        Text("Looking for something.....", color = Color.LightGray)
                    }

                    Row(
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier
                            .background(color = Color.Transparent)
                            .fillMaxWidth()
                    ){
                        val hotel = LocalContext.current
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
                                .width(120.dp)
                        ){
                            Image(imageVector = Icons.Default.Home, contentDescription = "")
                            Text("Hotel", color = Color.Black)
                        }

                        val rental = LocalContext.current
                        Button(
                            onClick = {
                                navController.navigate(ROUTE_MIT) {
                                    popUpTo(ROUTE_HOME) { inclusive = true }
                                }
                            },
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.outlinedButtonColors(Color.Green),
                            border = BorderStroke(1.5.dp, Color.LightGray),
                            contentPadding = PaddingValues(15.dp),
                            modifier = Modifier
                                .height(50.dp)
                                .width(120.dp)
                        ){
                            Image(imageVector = Icons.Default.Home, contentDescription = "")

                            Text("Rentals", color = Color.Black)
                        }

                        val restaurant = LocalContext.current
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
                                .width(120.dp)
                        ){
                            Image(imageVector = Icons.Default.Home, contentDescription = "")

                            Text("Restaurant", color = Color.Black)
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Column {
                        Card(
                            elevation = CardDefaults.cardElevation(200.dp),
                            border = BorderStroke(1.5.dp, color = Color.Transparent),
                            modifier = Modifier
                                .size(400.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.wandering),
                                contentDescription = "Nusa Penida",
                                modifier = Modifier
                                    .size(500.dp)
                            )
                            Row(
                                modifier = Modifier
                                    .padding(0.dp)
                            ) {
                                Text(text = "Forest Haven Estate - Modern Villa", textAlign = TextAlign.Justify)
                            }
                        }

                        Spacer(modifier = Modifier.height(20.dp))


                        Card(
                            elevation = CardDefaults.cardElevation(200.dp),
                            border = BorderStroke(1.5.dp, color = Color.Transparent),
                            modifier = Modifier
                                .size(400.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.qaqa),
                                contentDescription = "Nusa Penida",
                                modifier = Modifier
                                    .size(500.dp)
                            )
                            Row(
                                modifier = Modifier
                                    .padding(0.dp)
                            ) {
                                Text(text = "Forest Haven Estate - Modern Villa", textAlign = TextAlign.Justify)
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
    Services(rememberNavController())
}

