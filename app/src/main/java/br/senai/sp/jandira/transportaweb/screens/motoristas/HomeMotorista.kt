package br.senai.sp.jandira.transportaweb.screens.motoristas

import android.inputmethodservice.Keyboard
import android.view.Surface
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Surface
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.transportaweb.R
import br.senai.sp.jandira.transportaweb.screens.LoginM
import br.senai.sp.jandira.transportaweb.ui.theme.TransportaWebTheme

@Composable
fun HomeM(controleDeNavegacao: NavHostController){

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFF61221)
    ){
        Box(
            modifier = Modifier
                .padding(bottom = 650.dp)
                .background(Color.White, shape =
                    RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp))
        ){
            Row(
                modifier = Modifier.padding(top = 30.dp, start = 0.dp)
            ) {
                Box(
                    modifier = Modifier
                        .width(175.dp)
                        .height(55.dp)
                        .padding(top = 0.dp)
                ) {
                    Image(
                        painterResource(R.drawable.logoo),
                        contentDescription = "Logo",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                Row(
                    modifier = Modifier
                        .height(55.dp)

                ){
                    Text(
                        modifier = Modifier
                            .padding(top = 16.dp, start = 80.dp),
                        text = "Jamal"
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(start = 8.dp)
                ){
                    Card(
                        modifier = Modifier
                            .padding(0.dp)
                            .size(55.dp),
                        shape = CircleShape,
                        border = BorderStroke(2.dp, Color.White)
                    ) {

                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    TransportaWebTheme {
        HomeM(controleDeNavegacao = NavHostController(LocalContext.current))
    }
}

