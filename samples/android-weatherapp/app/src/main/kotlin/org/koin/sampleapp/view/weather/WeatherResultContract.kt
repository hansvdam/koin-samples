package org.koin.sampleapp.view.weather

import org.koin.sampleapp.model.DailyForecastModel
import org.koin.sampleapp.util.mvp.BasePresenter
import org.koin.sampleapp.util.mvp.BaseView

/**
 * Weather MVP Contract
 */
interface WeatherResultContract {
    interface View : BaseView<Presenter> {
        fun onDetailSaved()
        fun displayError(error: Throwable)
    }

    interface Presenter : BasePresenter<View> {
        fun selectWeatherDetail(detail: DailyForecastModel)
    }
}
