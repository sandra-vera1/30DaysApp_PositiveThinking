package com.example.a30daysapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30daysapp.data.Datasource
import com.example.a30daysapp.model.PositiveThinking
import com.example.a30daysapp.ui.theme._30DaysAppTheme
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _30DaysAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)){
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text =  stringResource(R.string.app_name),
                            style = MaterialTheme.typography.displayLarge,
                            modifier = Modifier.padding(16.dp)
                        )
                        DaysApp()
                    }
                }
            }
        }
    }
}

@Composable
fun DaysApp(modifier: Modifier = Modifier) {

    PositiveThinkingList(PositiveThinkingList = Datasource().loadPositiveThinking())
}
@Composable
fun PositiveCard(
    positive: PositiveThinking,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier
        //.fillMaxSize()
        .fillMaxWidth()
    ){
       // println("Debugging")
        var expanded by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null
                ) {
                    expanded = !expanded
                }
                .animateContentSize()
                .height(if (expanded) 390.dp else 50.dp)
        ){
            Text(
                text =  stringResource(positive.stringDayId),
                style = MaterialTheme.typography.displayMedium,
                modifier = Modifier.padding(start= 10.dp,top = 10.dp,bottom = 4.dp)
            )

            if (expanded) {
                Text(
                    text =  "Listen today: " + stringResource(positive.stringSongId),
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(start= 10.dp,top = 0.dp, bottom = 10.dp, end = 10.dp)
                )
                Image(
                    painter = painterResource(positive.imageResourceId),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth() // Keep it readable with line breaks
                        .height(194.dp),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text =  stringResource(positive.stringResourceId),
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(start= 10.dp,top = 5.dp, bottom = 10.dp, end = 10.dp)
                )
            }

        }
    }
}
@Composable
fun PositiveThinkingList(PositiveThinkingList: List<PositiveThinking>){
    LazyColumn(){
        items(items = PositiveThinkingList){
                positive-> PositiveCard(
            positive = positive,
            modifier = Modifier.padding(8.dp)
        )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _30DaysAppTheme {
        DaysApp()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreviewDark() {
    _30DaysAppTheme(darkTheme= true) {
        DaysApp()
    }

}