package com.example.mystore.Screens.Search

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import com.example.mystore.Models.Featured
import com.example.mystore.R

@Composable
fun Seach(navController: NavHostController) {
    var search by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.height(22.dp))
        Row {
            IconButton(onClick = {
                navController.popBackStack()
            }) {
                Icon(painter = painterResource(id = R.drawable.back), contentDescription ="back        " )
            }
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
                trailingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.close),
                        contentDescription = "search",
                        modifier = Modifier.size(24.dp)
                    )
                },
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

        }
        Spacer(modifier = Modifier.height(12.dp))
        Row (
            modifier = Modifier.fillMaxWidth().padding(end = 16.dp, start = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = "Results for “ Shoes “", color = Color.Black, fontSize = 14.sp, fontWeight = FontWeight.W600)
            Text(text = "6 Results Found", color = Color(android.graphics.Color.parseColor("#EA6D35")), fontSize = 12.sp, fontWeight = FontWeight.W600)
        }
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(18.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(10.dp),
        ) {
            val feature: List<Featured> = listOf(
                Featured("Watch", "$ ${430}", R.drawable.profilepic, R.drawable.favorite),
                Featured("Watch", "$ ${430}", R.drawable.profilepic, R.drawable.favorite),
                Featured("Watch", "$ ${430}", R.drawable.profilepic, R.drawable.favorite),
                Featured("Watch", "$ ${430}", R.drawable.profilepic, R.drawable.favorite),
                Featured("Watch", "$ ${430}", R.drawable.profilepic, R.drawable.favorite),
                Featured("Watch", "$ ${430}", R.drawable.profilepic, R.drawable.favorite),
                Featured("Watch", "$ ${430}", R.drawable.profilepic, R.drawable.favorite),
                Featured("Watch", "$ ${430}", R.drawable.profilepic, R.drawable.favorite),
                Featured("Watch", "$ ${430}", R.drawable.profilepic, R.drawable.favorite),
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
                        .height(170.dp)
                        .shadow(
                            elevation = 2.dp,
                            shape = RoundedCornerShape(12.dp)
                        ).clickable {
                            navController.navigate("Details")
                        }
                ) {
                    ConstraintLayout(
                        modifier = Modifier.background(Color.White)
//                        modifier = Modifier
//                            .height(IntrinsicSize.Max)
//                            .background(Color.White)
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
                                .height(130.dp),
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