package com.example.wallet_ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Apps
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material.icons.filled.GridView
import androidx.compose.material.icons.outlined.GridView
import androidx.compose.material.icons.rounded.ArrowDownward
import androidx.compose.material.icons.rounded.ArrowUpward
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActionSection(
    modifier: Modifier = Modifier
) {
    Row (
        modifier=modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ){
        ActionButton(
            icon = Icons.Rounded.ArrowUpward,
            text = "Send",
            color = Color.Red.copy(0.4f)
        )
        ActionButton(
            icon = Icons.Rounded.ArrowDownward,
            text = "Receive",
            color = Color.Green.copy(0.4f)
        )
        ActionButton(
            icon = Icons.Outlined.GridView,
            text = "More",
            color = Color.Gray.copy(0.4f)
        )
    }
}

@Composable
fun ActionButton(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    text: String,
    color:Color
) {

    Column(
        modifier=modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier=Modifier
                .clip(RoundedCornerShape(15.dp))
                .background(color)
                .size(75.dp),
            contentAlignment = Alignment.Center
        ){
            Icon(
                imageVector = icon,
                contentDescription = text,
                tint=Color.Black,
                modifier=Modifier
                    .size(40.dp)
            )
        }
        Text(
            text=text,
            fontSize = 18.sp,
            fontFamily = Font(R.font.play).toFontFamily(),
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}