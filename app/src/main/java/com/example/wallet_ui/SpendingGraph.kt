package com.example.wallet_ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.bytebeats.views.charts.bar.BarChart
import me.bytebeats.views.charts.bar.BarChartData
import me.bytebeats.views.charts.bar.render.label.SimpleLabelDrawer
import me.bytebeats.views.charts.bar.render.xaxis.SimpleXAxisDrawer
import me.bytebeats.views.charts.bar.render.yaxis.SimpleYAxisDrawer

@Composable
fun SpendingGraph(
    modifier: Modifier = Modifier
) {
    Text(
        modifier=modifier
            .padding(start = 12.dp),
        text = "Spending Statistics",
        fontSize = 25.sp,
        fontFamily = Font(R.font.play).toFontFamily()
    )
    Spacer(modifier=Modifier.height(8.dp))
    Chart(modifier)
}


@Composable
fun Chart(
    modifier: Modifier = Modifier
) {
        Box(modifier=Modifier.height(200.dp)){
            BarChart(
                modifier = modifier,
               barChartData = BarChartData(bars = spendingByDay),
                xAxisDrawer = SimpleXAxisDrawer(
                    axisLineColor = MaterialTheme.colorScheme.onBackground.copy(0.2f),
                    axisLineThickness = 2.dp
                ),
                yAxisDrawer = SimpleYAxisDrawer(
                    labelTextColor = MaterialTheme.colorScheme.onBackground.copy(0.7f),
                    axisLineColor = MaterialTheme.colorScheme.onBackground.copy(0.1f),
                    drawLabelEvery = 3,
                    labelValueFormatter = {
                        "$ ${it.toInt()}"
                    }
                ),
                labelDrawer = SimpleLabelDrawer(
                    drawLocation = SimpleLabelDrawer.DrawLocation.Outside,
                    labelTextSize = 15.sp,
                    labelTextColor = MaterialTheme.colorScheme.onBackground.copy(0.7f)
                )

            )
        }
}
val spendingByDay = listOf(
    BarChartData.Bar(
        label = "Dec 1",
        value = 123f,
        color = randomColor(50),
    ),
    BarChartData.Bar(
        label = "Dec 2",
        value = 160f,
        color = randomColor(50),
    ),
    BarChartData.Bar(
        label = "Dec 3",
        value = 204f,
        color = randomColor(50),
    ),
    BarChartData.Bar(
        label = "Dec 4",
        value = 34f,
        color = randomColor(50),
    ),
    BarChartData.Bar(
        label = "Dec 5",
        value = 74f,
        color = randomColor(50),
    )
)