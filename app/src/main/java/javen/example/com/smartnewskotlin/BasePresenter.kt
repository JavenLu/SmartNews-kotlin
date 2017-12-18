package javen.example.com.smartnewskotlin

/**
 * Created by Javen on 18/12/2017
 */
abstract class BasePresenter<T>(t: T) {
    abstract fun initData()
}