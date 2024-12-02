package com.example.mystore.Screens.MyOrder

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mystore.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Myorder(navController: NavHostController) {
    var selectedTabIndex by remember { mutableStateOf(0) }
    Scaffold(
        containerColor = colorResource(id = R.color.scfool_color),

        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "My Orders",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth(),
                        fontWeight = FontWeight.W600,
                        fontSize = 18.sp,

                        )
                },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.navigate("Home") {
                            popUpTo("Home") { inclusive = true }
                            launchSingleTop = true
                        }
                    }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Menu",
                            tint = Color.Black  // Navigation icon color
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* Handle navigation click */ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.more_vert),
                            contentDescription = "Menu",
                            tint = Color.Black  // Navigation icon color
                        )
                    }
                }
            )
        }

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(start = 16.dp, end = 16.dp),
        ) {
            TabRow(
                selectedTabIndex = selectedTabIndex,
                modifier = Modifier.fillMaxWidth(),
                containerColor = colorResource(id = R.color.scfool_color),
            ) {
                Tab(
                    selected = selectedTabIndex == 0,
                    onClick = { selectedTabIndex = 0 },
//                    icon = { Icon(Icons.Filled.Home,
//                        contentDescription = "Home")
//                           },
                    text = { Text("Delivered") }
                )
                Tab(
                    selected = selectedTabIndex == 1,
                    onClick = { selectedTabIndex = 1 },
//                    icon = { Icon(Icons.Filled.Settings,
//                        contentDescription = "Settings") },
                    text = { Text("Processing") }
                )
                Tab(
                    selected = selectedTabIndex == 2,
                    onClick = { selectedTabIndex = 2 },
//                    icon = { Icon(Icons.Filled.Settings,
//                        contentDescription = "Settings") },
                    text = { Text("Cancelled") }
                )
            }

            when (selectedTabIndex) {
                0 -> Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(colorResource(id = R.color.scfool_color)),

                    ) {

                    LazyColumn(
                        contentPadding = PaddingValues(16.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        items(4) {

                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(200.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = colorResource(id = R.color.white)
                                )
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "Order №1947034",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.W600
                                    )
                                    Text(
                                        text = "05-12-2019",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.W400
                                    )

                                }

                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
//                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "Tracking number:",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.W400
                                    )
                                    Text(
                                        text = "  IW3475453455",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.W600
                                    )

                                }
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Row {
                                        Text(
                                            text = "Quantity:",
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.W400
                                        )
                                        Text(
                                            text = "  3",
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.W600
                                        )
                                    }
                                    Row {
                                        Text(
                                            text = "Total Amount:",
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.W400
                                        )
                                        Text(
                                            text = "  ${112}$",
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.W600
                                        )
                                    }


                                }
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    TextButton(
                                        modifier = Modifier.width(99.dp)
                                        .border(width = 1.dp, color = colorResource(id = R.color.black),shape = MaterialTheme.shapes.extraLarge),

                                        onClick = { /*TODO*/ }) {
                                        Text(
                                            text = "Details",
                                            fontSize = 14.sp,
                                            color = colorResource(id = R.color.black),
                                            fontWeight = FontWeight.W400
                                        )
                                    }
                                    Text(
                                        text = "Delivered",
                                        color = colorResource(id = R.color.txt_color),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.W500
                                    )
                                }
                            }
                        }
                    }

                }

                1 -> Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(colorResource(id = R.color.scfool_color)),

                    ) {

                    LazyColumn(
                        contentPadding = PaddingValues(16.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        items(4) {

                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(200.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = colorResource(id = R.color.white)
                                )
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "Order №1947034",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.W600
                                    )
                                    Text(
                                        text = "05-12-2019",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.W400
                                    )

                                }

                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
//                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "Tracking number:",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.W400
                                    )
                                    Text(
                                        text = "  IW3475453455",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.W600
                                    )

                                }
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Row {
                                        Text(
                                            text = "Quantity:",
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.W400
                                        )
                                        Text(
                                            text = "  3",
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.W600
                                        )
                                    }
                                    Row {
                                        Text(
                                            text = "Total Amount:",
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.W400
                                        )
                                        Text(
                                            text = "  ${112}$",
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.W600
                                        )
                                    }


                                }
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    TextButton(
                                        modifier = Modifier.width(99.dp)
                                            .border(width = 1.dp, color = colorResource(id = R.color.black),shape = MaterialTheme.shapes.extraLarge),

                                        onClick = { /*TODO*/ }) {
                                        Text(
                                            text = "Details",
                                            fontSize = 14.sp,
                                            color = colorResource(id = R.color.black),
                                            fontWeight = FontWeight.W400
                                        )
                                    }
                                    Text(
                                        text = "Delivered",
                                        color = colorResource(id = R.color.txt_color),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.W500
                                    )
                                }
                            }
                        }
                    }

                }
                2 ->  Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(colorResource(id = R.color.scfool_color)),

                    ) {

                    LazyColumn(
                        contentPadding = PaddingValues(16.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        items(4) {

                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(200.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = colorResource(id = R.color.white)
                                )
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "Order №1947034",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.W600
                                    )
                                    Text(
                                        text = "05-12-2019",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.W400
                                    )

                                }

                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
//                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "Tracking number:",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.W400
                                    )
                                    Text(
                                        text = "  IW3475453455",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.W600
                                    )

                                }
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Row {
                                        Text(
                                            text = "Quantity:",
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.W400
                                        )
                                        Text(
                                            text = "  3",
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.W600
                                        )
                                    }
                                    Row {
                                        Text(
                                            text = "Total Amount:",
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.W400
                                        )
                                        Text(
                                            text = "  ${112}$",
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.W600
                                        )
                                    }


                                }
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    TextButton(
                                        modifier = Modifier.width(99.dp)
                                            .border(width = 1.dp, color = colorResource(id = R.color.black),shape = MaterialTheme.shapes.extraLarge),

                                        onClick = { /*TODO*/ }) {
                                        Text(
                                            text = "Details",
                                            fontSize = 14.sp,
                                            color = colorResource(id = R.color.black),
                                            fontWeight = FontWeight.W400
                                        )
                                    }
                                    Text(
                                        text = "Cancelled",
                                        color = colorResource(id = R.color.txtcncel_color),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.W500
                                    )
                                }
                            }
                        }
                    }

                }
            }
        }
    }

}



