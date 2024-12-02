package com.example.mystore.Screens.Details


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import com.example.mystore.R

@Composable
fun Details(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .imePadding()
            .verticalScroll(rememberScrollState()),

        ) {
        ConstraintLayout {
            val (img, row) = createRefs()
            Image(
                painter = painterResource(id = R.drawable.shoesss),
                contentDescription = "shores",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(390.dp)
                    .constrainAs(img) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    },
                contentScale = ContentScale.Crop
            )
            Row(
                modifier = Modifier
                    .padding(25.dp)
                    .fillMaxWidth()
                    .constrainAs(row) {
                        top.linkTo(parent.top)
                        end.linkTo(parent.end)
                        start.linkTo(parent.start)
                    },
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Box(
                    modifier = Modifier
                        .size(50.dp) // Set the size of the box
                        .background(
                            color = colorResource(id = R.color.carticon_color),
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
                Box(
                    modifier = Modifier
                        .size(50.dp) // Set the size of the box
                        .background(
                            color = colorResource(id = R.color.carticon_color),
                            shape = RoundedCornerShape(100.dp)
                        ) // Rounded corners
                        .padding(16.dp), // Padding for inner content
                    contentAlignment = Alignment.Center
                ) {
                    IconButton(onClick = { /* Handle back button click */ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.favorite),
                            contentDescription = "no",
                            modifier = Modifier.size(34.dp)
                        )
                    }
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, top = 16.dp, end = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Nike Shoes",
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.W600,
            )
            Text(
                text = "$${430}", fontWeight = FontWeight.W600, fontSize = 16.sp,
                color = colorResource(id = R.color.btn_color)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, top = 1.dp, end = 16.dp),
//            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = colorResource(id = R.color.star_color),
            )
            Text(text = " 4.6", fontWeight = FontWeight.W600, fontSize = 16.sp)
            Text(
                text = " ( 20 Review)", fontWeight = FontWeight.W600,
                color = Color.Gray, fontSize = 16.sp,
            )
        }
        Text(
            text = "Description",
            fontWeight = FontWeight.W600,
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 16.dp, top = 1.dp, end = 16.dp),
        )
        Text(
            text = "praesentium beatae temporibus nobis. Velit dolorem facilis neque autem. Itaque voluptatem expedita qui eveniet id veritatis eaque. Blanditiis quia placeat nemo. Nobis laudantium nesciunt perspiciatis sit eligendi.",
            modifier = Modifier.padding(start = 16.dp, top = 5.dp, end = 16.dp),
        )
        Text(
            text = "Size",
            fontWeight = FontWeight.W600,
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp),
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, top = 16.dp, end = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextButton(
                modifier = Modifier
                    .width(44.dp)
                    .border(
                        width = 1.dp,
                        color = colorResource(id = R.color.black),
                        shape = MaterialTheme.shapes.small
                    ),

                onClick = { /*TODO*/ }) {
                Text(
                    text = "10",
                    fontSize = 14.sp,
                    color = colorResource(id = R.color.black),
                    fontWeight = FontWeight.W600
                )
            }
            TextButton(
                modifier = Modifier
                    .width(44.dp)
                    .border(
                        width = 1.dp,
                        color = colorResource(id = R.color.black),
                        shape = MaterialTheme.shapes.small
                    ),

                onClick = { /*TODO*/ }) {
                Text(
                    text = "10",
                    fontSize = 14.sp,
                    color = colorResource(id = R.color.black),
                    fontWeight = FontWeight.W600
                )
            }
            TextButton(
                modifier = Modifier
                    .width(44.dp)
                    .border(
                        width = 1.dp,
                        color = colorResource(id = R.color.black),
                        shape = MaterialTheme.shapes.small
                    ),

                onClick = { /*TODO*/ }) {
                Text(
                    text = "10",
                    fontSize = 14.sp,
                    color = colorResource(id = R.color.black),
                    fontWeight = FontWeight.W600
                )
            }
            TextButton(
                modifier = Modifier
                    .width(44.dp)
                    .border(
                        width = 1.dp,
                        color = colorResource(id = R.color.black),
                        shape = MaterialTheme.shapes.small
                    ),

                onClick = { /*TODO*/ }) {
                Text(
                    text = "10",
                    fontSize = 14.sp,
                    color = colorResource(id = R.color.black),
                    fontWeight = FontWeight.W600
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, top = 16.dp, end = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.btn_color),
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .width(300.dp)
                    .height(55.dp),
                onClick = {
                    navController.navigate("Cart")
                }) {
                Text(text = "Buy Now")
            }
            Box(
                modifier = Modifier
                    .size(50.dp) // Set the size of the box
                    .background(
                        color = colorResource(id = R.color.carticon_color),
                        shape = RoundedCornerShape(100.dp)
                    ) // Rounded corners
                    .padding(16.dp), // Padding for inner content
                contentAlignment = Alignment.Center
            ) {
                IconButton(onClick = { /* Handle back button click */ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.shopping),
                        contentDescription = "no",
                        modifier = Modifier.size(34.dp)
                    )
                }
            }
        }
    }
}