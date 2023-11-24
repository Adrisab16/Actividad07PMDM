package com.pmdm.actividad07pmdm

import androidx.annotation.DrawableRes

data class Superhero(val superheroName: String, val realName: String, val publisher: String, @DrawableRes val photo: Int) {
}