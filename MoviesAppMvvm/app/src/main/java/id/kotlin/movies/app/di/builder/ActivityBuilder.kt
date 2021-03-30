package id.kotlin.movies.app.di.builder

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import id.kotlin.movies.app.di.factory.ViewModelFactory
import id.kotlin.movies.app.di.module.DetailModule
import id.kotlin.movies.app.di.module.MainModule
import id.kotlin.movies.app.di.module.PagingModule
import id.kotlin.movies.app.di.scope.Presentation
import id.kotlin.movies.app.presentation.detail.DetailActivity
import id.kotlin.movies.app.presentation.main.MainActivity
import id.kotlin.movies.app.presentation.paging.PagingActivity

/*
 * Copyright (C) 2020 the original author laminalfalah All Right Reserved.
 * 
 * This is part of the MoviesAppMvp.
 * 
 * id.kotlin.movies.app.di.builder
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Created by laminalfalah on 18/10/20
 */

@Module
abstract class ActivityBuilder {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Presentation
    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun contributesMainActivity(): MainActivity

    @Presentation
    @ContributesAndroidInjector(modules = [PagingModule::class])
    abstract fun contributesPagingActivity(): PagingActivity

    @Presentation
    @ContributesAndroidInjector(modules = [DetailModule::class])
    abstract fun contributesDetailActivity(): DetailActivity

}