package com.example.furnitureapp

data class FurnitureModel (
    val uri : String,
    val name: String,
    val rating: Double,
    val price: Double
)

val data : List<FurnitureModel> = listOf(
    FurnitureModel("armchair_1.png", "scott rolf", 4.5, 128.0),
    FurnitureModel("armchair_2.png", "gray modern", 4.0, 450.0),
    FurnitureModel("armchair_3.png", "family chair", 3.5, 230.0),
    FurnitureModel("armchair_4.png", "green sophie", 4.0, 380.0),
    FurnitureModel("armchair_5.png", "pilezzo", 4.5, 550.0),
    FurnitureModel("armchair_6.png", "minimalist chair", 4.0, 300.0),
    FurnitureModel("armchair_7.png", "golden days", 4.5, 1450.0),
    FurnitureModel("armchair_8.png", "grandpa chair", 4.5, 950.0),
    FurnitureModel("armchair_9.png", "city chair", 3.5, 150.0),
)