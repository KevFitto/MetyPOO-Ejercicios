package com.example.api_carrera.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PantallaCarrera() {
    var nombreCarrera by remember { mutableStateOf("") }
    var listaCarreras by remember { mutableStateOf(listOf<String>()) }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {

        Text(
            text = "Gestión de Carreras",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = nombreCarrera,
            onValueChange = { nombreCarrera = it },
            label = { Text("Nombre de la carrera") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = {
                if (nombreCarrera.isNotBlank()) {
                    listaCarreras = listaCarreras + nombreCarrera
                    nombreCarrera = ""
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Agregar carrera")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Listado de carreras:",
            style = MaterialTheme.typography.titleMedium
        )

        LazyColumn {
            items(listaCarreras) { carrera ->
                Text(
                    text = "• $carrera",
                    modifier = Modifier.padding(vertical = 4.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaCarreraPreview() {
    PantallaCarrera()
}
