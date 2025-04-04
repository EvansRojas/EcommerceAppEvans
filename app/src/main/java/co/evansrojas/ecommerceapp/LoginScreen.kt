package co.evansrojas.ecommerceapp

import androidx.compose.material3.Scafford
import androidx.compose.ui.Modifer
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun login(){
    Scaffold { innerPadding ->
        column(
            modifer = Modifer.padding(innerPadding)

        ){
            Image(
                painter = painterResource(R.drawable.LogoUnab),
                contentDescription ="Logo Unab",
                modifer = Modifer.Size(150.dp)
            )

            Spacer(modifer = Modifer.height(32.dp))

            Text(
                text = "Iniciar Sesión"
                fontSiz = 24.sp
                color = Color(color:0xFFFF9900),
                fontWeight =FontWeight.Bold

            )

            Spacer(modifer = Modifer.height(32.dp))

            OutLinedTextFile(
                value = "",
                onValueChange ={},
                modifer = Modifer.fillMaxWidth()
                leadingIcon{
                        Icon(imageVector = Icons.Default.Email,
                        contectDescription = "Email"
                        tint = Color(color: 0xFFFF9900)
                        )
                    label = {
                        Text(text = "Correo Electronico")
                    },
                    shape = RoundedCornerShape(12.dp)
                }
            )
        }
    }
}

@prefiew
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}