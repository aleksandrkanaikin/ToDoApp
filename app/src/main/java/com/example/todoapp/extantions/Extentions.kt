package com.example.todoapp

import android.app.Activity
import android.provider.ContactsContract.CommonDataKinds.Email
import android.text.Editable
import java.util.regex.Pattern

fun Activity.ValidEmail(text:Editable?): String? {
    return if (text?.isNotEmpty()!!){
        if (text.length>=7 && text.contains("@") && text.contains(".") ) return null
        else return "Неверный формат почты. Пример: example@mail.com"
    }
    else "Поле не должно быть пустым"
}

fun Activity.ValidPassword(text: Editable?): String?{
    return if (text?.isNotEmpty()!!){
        if (text.length > 7) return null
        else return "Пароль должен содержать больше 8 символов"
    }
    else "Поле не должно быть пустым"
}

fun Activity.ValidName(text: Editable?): String?{
    return if (text?.isNotEmpty()!!) null else "Поле не должно быть пустым"
}

fun Activity.ValidConfirmPassword(pass: Editable?, confirmpass: Editable?): String?{

    return if(pass.toString() == confirmpass.toString() && pass?.length!! > 7) {
        null
    } else {
        "Пароли не совпадают"
    }
}