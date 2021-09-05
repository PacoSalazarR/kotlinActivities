package com.example.kotlinactivities

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
class Element (
    var name: String = "",
    var image: AssignedImage? = null,
    var texto: AssignedText? = null
): Parcelable {

    companion object {
        val elements = arrayOf(
            Element("Cerezas", AssignedImage.IMAGE_1, AssignedText.TEXT_1),
            Element("Chile", AssignedImage.IMAGE_2, AssignedText.TEXT_2),
            Element("Fresa", AssignedImage.IMAGE_3, AssignedText.TEXT_3),
            Element("Manzana", AssignedImage.IMAGE_4, AssignedText.TEXT_4),
            Element("Naranja", AssignedImage.IMAGE_5, AssignedText.TEXT_5),
            Element("Queso", AssignedImage.IMAGE_6, AssignedText.TEXT_6),
            Element("Uvas", AssignedImage.IMAGE_7, AssignedText.TEXT_7),
            Element("Pescado", AssignedImage.IMAGE_8, AssignedText.TEXT_8),
            Element("Pizza", AssignedImage.IMAGE_9, AssignedText.TEXT_9),
            Element("Zanahoria", AssignedImage.IMAGE_10, AssignedText.TEXT_10)
        )
    }

}
