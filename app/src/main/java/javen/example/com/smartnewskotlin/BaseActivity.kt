package javen.example.com.smartnewskotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by Javen on 18/12/2017.
 */
abstract class BaseActivity<T>(t: BasePresenter<T>) : AppCompatActivity() {
    var basePresenter: T? = null

    abstract val layout: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout)
        basePresenter = initPresent()
        init()
        initView()
    }

    abstract fun initView()

    abstract fun initPresent(): T

    abstract fun init()
}