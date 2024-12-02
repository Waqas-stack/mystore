package com.example.mystore.Screens.Home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import com.example.mystore.Models.BottomMenuItems
import com.example.mystore.Models.Featured
import com.example.mystore.R

//@Preview(showBackground = true)
@Composable
fun Home(navController: NavHostController) {
    var search by remember { mutableStateOf("") }

    Scaffold(
        containerColor = colorResource(id = R.color.white),
        bottomBar = {
            BottomBar(navController)
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),

            ) {
            Spacer(modifier = Modifier.height(28.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Card(
                    shape = CircleShape,
                    elevation = CardDefaults.cardElevation(8.dp),
                    modifier = Modifier.size(60.dp) // Set your desired size
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.profilepic), // Replace with your image resource
                        contentDescription = "Profile Picture",
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(CircleShape)
                            .clickable {
//                            navController.navigate("Profile")
                            }, // This makes the image circular
                        contentScale = ContentScale.Crop // Crop to make the image fill the shape
                    )

                }
                Column(
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .weight(1f),
                ) {
                    Text(text = "Hello!")
                    Text(text = "John William", fontWeight = FontWeight.Bold, fontSize = 16.sp)

                }
                Box(
                    modifier = Modifier
                        .size(50.dp) // Set the size of the box
                        .background(
                            Color(android.graphics.Color.parseColor("#F8F7F7")),
                            shape = androidx.compose.foundation.shape.RoundedCornerShape(100.dp)
                        ) // Rounded corners
                        .padding(16.dp), // Padding for inner content
                    contentAlignment = Alignment.Center
                ) {
                    IconButton(onClick = {
//                    navController.navigate("Settings")
                    }) {
                        Icon(
                            painter = painterResource(id = R.drawable.notification),
                            contentDescription = "no",
                            modifier = Modifier.size(34.dp)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(28.dp))
            TextField(
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.search),
                        contentDescription = "search",
                        modifier = Modifier.size(24.dp)
                    )
                },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color(android.graphics.Color.parseColor("#F8F7F7")),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    cursorColor = Color(android.graphics.Color.parseColor("#EA6D35"))
                ),
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                shape = RoundedCornerShape(18.dp),
                placeholder = { Text(text = "Search here..") },

                value = search, onValueChange = {
                    search = it
                }

            )
            Text(
                text = "Featured",
                fontWeight = FontWeight.W600,
                fontSize = 16.sp,
                modifier = Modifier.padding(start = 16.dp, top = 16.dp)

            )
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                val feature: List<Featured> = listOf(
                    Featured("Watch", "$ ${430}", R.drawable.profilepic, R.drawable.favorite),
                    Featured("Watch", "$ ${430}", R.drawable.profilepic, R.drawable.favorite),
                    Featured("Watch", "$ ${430}", R.drawable.profilepic, R.drawable.favorite),
                    Featured("Watch", "$ ${430}", R.drawable.profilepic, R.drawable.favorite),
                    Featured("Watch", "$ ${430}", R.drawable.profilepic, R.drawable.favorite),
                )
                items(feature) { featured ->
                    Column(
                        modifier = Modifier
                            .width(126.dp)
                            .height(130.dp)
                            .shadow(
                                elevation = 2.dp,
                                shape = RoundedCornerShape(12.dp)
                            ).clickable {
                                navController.navigate("Details")
                            }
                    ) {
                        ConstraintLayout(
                            modifier = Modifier
                                .height(IntrinsicSize.Max)
                                .background(Color.White)
//                        modifier = Modifier.background(Color.Red)
                        ) {
                            val (image, icon, title, price) = createRefs()
                            Image(
                                painter = painterResource(id = featured.image),
                                contentDescription = "",
                                modifier = Modifier
                                    .constrainAs(image) {
                                        top.linkTo(parent.top)
                                        start.linkTo(parent.start)
                                        end.linkTo(parent.end)
                                    }
                                    .fillMaxWidth()
                                    .height(90.dp),
                                contentScale = ContentScale.Crop
                            )
                            Icon(
                                painter = painterResource(id = featured.icon),
                                contentDescription = "fav",
                                modifier = Modifier.constrainAs(icon) {
                                    top.linkTo(parent.top, margin = 10.dp)
                                    end.linkTo(image.end, margin = 10.dp)

                                }
                            )
                            Text(text = featured.title,
                                fontWeight = FontWeight.W600,
                                fontSize = 14.sp,
                                modifier = Modifier.constrainAs(title) {
                                    top.linkTo(image.bottom)
                                    start.linkTo(image.start, margin = 5.dp)

                                })
                            Text(text = featured.price,
                                fontWeight = FontWeight.W600,
                                color = Color(android.graphics.Color.parseColor("#6055D8")),
                                fontSize = 12.sp, modifier = Modifier
                                    .padding(bottom = 5.dp)
                                    .constrainAs(price) {
                                        top.linkTo(title.bottom, margin = 1.dp)
                                        start.linkTo(title.start)
                                    })
                        }

                    }
//                Text(text = "Featured")
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Popular", fontWeight = FontWeight.W600, fontSize = 16.sp)
                Text(
                    text = "See All",
                    fontWeight = FontWeight.W400,
                    fontSize = 12.sp,
                    color = Color(android.graphics.Color.parseColor("#6055D8"))
                )
            }
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                val feature: List<Featured> = listOf(
                    Featured("Watch", "$ ${430}", R.drawable.profilepic, R.drawable.favorite),
                    Featured("Watch", "$ ${430}", R.drawable.profilepic, R.drawable.favorite),
                    Featured("Watch", "$ ${430}", R.drawable.profilepic, R.drawable.favorite),
                    Featured("Watch", "$ ${430}", R.drawable.profilepic, R.drawable.favorite),
                    Featured("Watch", "$ ${430}", R.drawable.profilepic, R.drawable.favorite),
                )
                items(feature) { featured ->
                    Column(
                        modifier = Modifier
                            .width(126.dp)
                            .height(130.dp)
                            .shadow(
                                elevation = 2.dp,
                                shape = RoundedCornerShape(12.dp)
                            ).clickable {
                                navController.navigate("Details")
                            }
                    ) {
                        ConstraintLayout(
                            modifier = Modifier
                                .height(IntrinsicSize.Max)
                                .background(Color.White)
//                        modifier = Modifier.background(Color.Red)
                        ) {
                            val (image, icon, title, price) = createRefs()
                            Image(
                                painter = painterResource(id = featured.image),
                                contentDescription = "",
                                modifier = Modifier
                                    .constrainAs(image) {
                                        top.linkTo(parent.top)
                                        start.linkTo(parent.start)
                                        end.linkTo(parent.end)
                                    }
                                    .fillMaxWidth()
                                    .height(90.dp),
                                contentScale = ContentScale.Crop
                            )
                            Icon(
                                painter = painterResource(id = featured.icon),
                                contentDescription = "fav",
                                modifier = Modifier.constrainAs(icon) {
                                    top.linkTo(parent.top, margin = 10.dp)
                                    end.linkTo(image.end, margin = 10.dp)

                                }
                            )
                            Text(text = featured.title,
                                fontWeight = FontWeight.W600,
                                fontSize = 14.sp,
                                modifier = Modifier.constrainAs(title) {
                                    top.linkTo(image.bottom)
                                    start.linkTo(image.start, margin = 5.dp)

                                })
                            Text(text = featured.price,
                                fontWeight = FontWeight.W600,
                                color = Color(android.graphics.Color.parseColor("#6055D8")),
                                fontSize = 12.sp, modifier = Modifier
                                    .padding(bottom = 5.dp)
                                    .constrainAs(price) {
                                        top.linkTo(title.bottom, margin = 1.dp)
                                        start.linkTo(title.start)
                                    })
                        }

                    }
//                Text(text = "Featured")
                }
            }
        }
    }

}

@Composable
fun BottomBar(navController: NavHostController) {
    val bottomMenuItems = prepareItem()
    var selectedItem by remember { mutableStateOf("profile") }
    BottomAppBar (
        containerColor = Color.White,
//        modifier = Modifier.height(60.dp)
    ){

        bottomMenuItems.forEachIndexed { index, item ->
            NavigationBarItem(
                alwaysShowLabel = true,
                enabled = true,
                selected =(selectedItem == item.title),
                onClick = {
                          selectedItem = item.title
                    navController.navigate(item.title)
                },
                label = {
                    Text(text = item.title, modifier = Modifier.padding(4.dp))
                },
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = item.title,
                        modifier = Modifier
                            .height(20.dp)
                            .width(20.dp)
                    )
                })
        }
    }

}

fun prepareItem(): List<BottomMenuItems> {
    val bottomMenuItems = arrayListOf<BottomMenuItems>()
    bottomMenuItems.add(
        BottomMenuItems(
            "Home",
            icon = R.drawable.home,
        )
    )
    bottomMenuItems.add(
        BottomMenuItems(
            "Seach",
            icon = R.drawable.search,
        )
    )
    bottomMenuItems.add(
        BottomMenuItems(
            "ProductList",
            icon = R.drawable.shopping,
        )
    )
    bottomMenuItems.add(
        BottomMenuItems(
            "Profile",
            icon = R.drawable.person,
        )
    )
    return bottomMenuItems
}
