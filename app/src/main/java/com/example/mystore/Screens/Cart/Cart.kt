package com.example.mystore.Screens.Cart

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mystore.R
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Cart(navController: NavHostController) {
    var quantity by remember { mutableStateOf(1) }
    val drwerstate = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drwerstate,
        drawerContent = {
            ModalDrawerSheet {
                DrawerContent()
            }
        }
    ) {
        Scaffold(
            topBar = {

                TopAppBar(
                    colors = TopAppBarDefaults.smallTopAppBarColors(
                        containerColor = Color.White,
                        titleContentColor = Color.Black
                    ),
                    navigationIcon = {
                        Icon(imageVector = Icons.Default.Menu,
                            contentDescription = "Menu",
                            modifier = Modifier.clickable {
                                scope.launch {
                                    drwerstate.apply {
                                        if (isClosed) open() else close()
                                    }
                                }
                            }
                        )
                    },
                    title = {
                        Text(text = "Cart")
                    },
                )
            }
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
            ) {
//                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(50.dp) // Set the size of the box
                            .background(
                                Color(android.graphics.Color.parseColor("#F8F7F7")),
                                shape = RoundedCornerShape(100.dp)
                            ) // Rounded corners
                            .padding(16.dp), // Padding for inner content
                        contentAlignment = Alignment.Center
                    ) {
                        IconButton(onClick = {
                            navController.popBackStack()
                        }) {
                            Icon(
                                painter = painterResource(id = R.drawable.back),
                                contentDescription = "no",
                                modifier = Modifier.size(34.dp)
                            )
                        }
                    }

                    Text(text = "Checkout", fontWeight = FontWeight.W600, fontSize = 16.sp)
                    Box(
                        modifier = Modifier
                            .size(50.dp) // Set the size of the box
                            .background(
                                Color(android.graphics.Color.parseColor("#F8F7F7")),
                                shape = RoundedCornerShape(100.dp)
                            ) // Rounded corners
                            .padding(16.dp), // Padding for inner content
                        contentAlignment = Alignment.Center
                    ) {
                        IconButton(onClick = { /* Handle back button click */ }) {
                            Icon(
                                painter = painterResource(id = R.drawable.more_vert),
                                contentDescription = "no",
                                tint = Color(android.graphics.Color.parseColor("#6055D8")),
                                modifier = Modifier.size(54.dp)
                            )
                        }
                    }

                }
                LazyColumn(
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    modifier = Modifier.height(400.dp)
                ) {
                    items(10) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(110.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(color = colorResource(id = R.color.grey_color)),
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.profilepic),
                                contentDescription = "ites",
                                modifier = Modifier
                                    .size(110.dp)
                                    .clip(RoundedCornerShape(10.dp))
                                    .padding(16.dp)

                                    .clip(RoundedCornerShape(10.dp))
                            )
                            Column(
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .padding(start = 5.dp)
                                    .fillMaxSize(),
                            ) {
                                Spacer(modifier = Modifier.height(20.dp))
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(end = 5.dp),
                                    verticalAlignment = Alignment.Bottom,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        text = "Watch",
                                        fontWeight = FontWeight.W600,
                                        fontSize = 14.sp
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.ic_delete),
                                        contentDescription = "delete",
                                        modifier = Modifier
                                            .size(24.dp)
                                            .padding(2.dp)
                                    )
                                }
                                Text(
                                    text = "Apple",
                                    fontWeight = FontWeight.W600,
                                    fontSize = 12.sp,
                                    color = colorResource(R.color.description_color),
                                )

                                Row(
                                    modifier = Modifier.fillMaxWidth(),
//                            verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        text = "$${40}",
                                        fontWeight = FontWeight.W600,
                                        fontSize = 12.sp
                                    )
                                    Row(
                                        modifier = Modifier,
                                        horizontalArrangement = Arrangement.Center
                                    ) {
                                        // Decrease Button
                                        Button(
                                            onClick = { if (quantity > 1) quantity-- }, // Decrease quantity, but not below 1
                                            modifier = Modifier
                                                .padding(8.dp)
                                                .size(30.dp) // Small button size
                                                .clip(RoundedCornerShape(50.dp)),
                                            contentPadding = PaddingValues(0.dp),
                                            colors = ButtonDefaults.buttonColors(
                                                containerColor = Color(
                                                    android.graphics.Color.parseColor(
                                                        "#6055D8"
                                                    )
                                                ),
                                                contentColor = Color.White,
                                            )
                                        ) {
                                            Text(
                                                text = "-",
                                                style = TextStyle(
                                                    fontWeight = FontWeight.Bold,
                                                    fontSize = MaterialTheme.typography.bodyLarge.fontSize
                                                )
                                            )
                                        }

                                        // Display Quantity Text
                                        Text(
                                            text = "$quantity",
                                            style = MaterialTheme.typography.bodyLarge.copy(
                                                fontWeight = FontWeight.Bold
                                            ),
                                            modifier = Modifier
                                                .padding(8.dp)
                                                .align(Alignment.CenterVertically)
                                        )

                                        // Increase Button
                                        Button(
                                            onClick = { quantity++ }, // Increase quantity
                                            modifier = Modifier
                                                .padding(8.dp)
                                                .size(30.dp) // Small button size
                                                .clip(RoundedCornerShape(50.dp)),
                                            contentPadding = PaddingValues(0.dp),
                                            colors = ButtonDefaults.buttonColors(
//                                    containerColor = Color.Gray,
//                                    contentColor = Color.White
                                                containerColor = Color(
                                                    android.graphics.Color.parseColor(
                                                        "#6055D8"
                                                    )
                                                ),
                                                contentColor = Color.White,
                                            )
                                        ) {
                                            Text(
                                                text = "+",
                                                style = TextStyle(
                                                    fontWeight = FontWeight.Bold,
                                                    fontSize = MaterialTheme.typography.bodyLarge.fontSize
                                                )
                                            )
                                        }
                                    }
                                }

                            }


                        }


                    }



                }
                Spacer(modifier = Modifier.height(170.dp))
                Button(
                    colors = ButtonDefaults.buttonColors(
//                containerColor = Color(android.graphics.Color.parseColor("#6055D8")),
                        containerColor = colorResource(id = R.color.btn_color),
                        contentColor = Color.White
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp)
                        .height(55.dp),
                    onClick = {
                        navController.navigate("Checkout")
                    }) {
                    Text(text = "Checkout")
                }
            }
        }
    }


}

@Composable
fun DrawerContent() {
    NavigationDrawerItem(
        icon = {
            Icon(imageVector = Icons.Default.Home,
                contentDescription = "Home",

            )
        },
        label = {
            Text(text = "Home")
    }, selected =false ,
        onClick = { /*TODO*/ })
    Divider()
    Spacer(modifier = Modifier.height(16.dp))
    NavigationDrawerItem(
        icon = {
            Icon(imageVector = Icons.Default.Notifications,
                contentDescription = "Notifications",

                )
        },
        label = {
            Text(text = "Notifications")
        }, selected =false ,
        onClick = { /*TODO*/ })
    Divider()
    Spacer(modifier = Modifier.height(16.dp))
    NavigationDrawerItem(
        icon = {
            Icon(imageVector = Icons.Default.Search,
                contentDescription = "Search",

                )
        },
        label = {
            Text(text = "Search")
        }, selected =false ,
        onClick = { /*TODO*/ })
}
