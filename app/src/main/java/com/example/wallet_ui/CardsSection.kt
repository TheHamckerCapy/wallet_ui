package com.example.wallet_ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardSection(modifier: Modifier = Modifier) {

    Box(
        modifier=modifier
    ){
        Box(
            modifier=modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
                .height(100.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(Color.Green, Color.Yellow)
                    )
                )
        )
        ElevatedCard(
            modifier=Modifier
                .fillMaxWidth()
                .height(240.dp)
                .padding(
                    horizontal = 22.dp,
                    vertical = 10.dp
                ),
            elevation = CardDefaults.cardElevation(6.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            CardContent(
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}

@Composable
fun CardContent(modifier: Modifier = Modifier) {
    Box(
        modifier=modifier
            .background(
                brush = Brush.linearGradient(
                    listOf(
                        MaterialTheme.colorScheme.primary,
                        MaterialTheme.colorScheme.error
                    )
                )
            )
    ){
        Icon(
            painter = painterResource(R.drawable.world),
            contentDescription = null,
            tint = MaterialTheme.colorScheme.background.copy(0.1f),
            modifier = Modifier
                .fillMaxSize()
                .offset(150.dp, 80.dp)

        )
        Column(
            modifier=Modifier
                .fillMaxWidth()
                .padding(22.dp)
                .align(Alignment.TopCenter)
            ,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "My Balance",
                fontFamily = Font(R.font.play).toFontFamily(),
                fontSize =22.sp,
                color = MaterialTheme.colorScheme.onPrimary.copy(0.7f)
            )
            Spacer(modifier=Modifier.height(8.dp))
            Text(
                text = "$2356",
                fontFamily = Font(R.font.play).toFontFamily(),
                fontSize =40.sp,
                color = MaterialTheme.colorScheme.onPrimary
            )



        }
        Row(
            modifier=Modifier
                .fillMaxWidth()
                .padding(22.dp)
                .align(Alignment.BottomCenter),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "* * * * 7890",
                color = MaterialTheme.colorScheme.onPrimary.copy(0.8f),
                fontFamily = Font(R.font.play).toFontFamily(),
                fontSize =24.sp,

            )
            Icon(
                painter = painterResource(R.drawable.visa),
                contentDescription = null,
                modifier=Modifier.width(100.dp),
                tint = MaterialTheme.colorScheme.onPrimary.copy(0.8f)
            )
        }
    }
}