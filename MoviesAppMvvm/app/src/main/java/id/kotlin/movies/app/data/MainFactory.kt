package id.kotlin.movies.app.data

import io.reactivex.Single

/*
 * Copyright (C) 2021 the original author laminalfalah All Right Reserved.
 * 
 * id.kotlin.movies.app.data
 * 
 * This is part of the MoviesAppMvvm.
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
 * Created by laminalfalah on 30/03/21
 */

class MainFactory(private val dataSource: ApiService) {

    fun discoveryMovie(page: Long): Single<MainResponse> = dataSource.discoverMovie(page = page)

}