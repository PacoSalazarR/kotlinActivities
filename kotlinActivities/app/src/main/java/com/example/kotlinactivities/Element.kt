package com.example.kotlinactivities

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
class Element (
    var name: String = "",
    var image: AssignedImage? = null,
    var texto: AssignedText? = null,
    var sound: Int = 0
): Parcelable {

    companion object {
        val elements = arrayOf(
            Element("Cerezas", AssignedImage.IMAGE_1, AssignedText.TEXT_1, R.raw.sound1),
            Element("Chile", AssignedImage.IMAGE_2, AssignedText.TEXT_2, R.raw.sound2),
            Element("Fresa", AssignedImage.IMAGE_3, AssignedText.TEXT_3, R.raw.sound3),
            Element("Manzana", AssignedImage.IMAGE_4, AssignedText.TEXT_4, R.raw.sound4),
            Element("Naranja", AssignedImage.IMAGE_5, AssignedText.TEXT_5, R.raw.sound5),
            Element("Queso", AssignedImage.IMAGE_6, AssignedText.TEXT_6, R.raw.sound6),
            Element("Uvas", AssignedImage.IMAGE_7, AssignedText.TEXT_7, R.raw.sound7),
            Element("Pescado", AssignedImage.IMAGE_8, AssignedText.TEXT_8, R.raw.sound8),
            Element("Pizza", AssignedImage.IMAGE_9, AssignedText.TEXT_9, R.raw.sound9),
            Element("Zanahoria", AssignedImage.IMAGE_10, AssignedText.TEXT_10, R.raw.sound10)
        )
    }

}
