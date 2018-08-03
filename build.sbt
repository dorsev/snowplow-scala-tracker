/*
 * Copyright (c) 2013-2018 Snowplow Analytics Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
lazy val root = project
  .in(file("."))
  .settings(Seq[Setting[_]](
    organization := "com.snowplowanalytics",
    version := "0.5.0",
    description := "Scala tracker for Snowplow",
    name := "snowplow-scala-tracker",
    scalaVersion := "2.12.6",
    crossScalaVersions := Seq("2.11.12", "2.12.6"),
    scalacOptions := BuildSettings.compilerOptions,
    javacOptions ++= BuildSettings.javaCompilerOptions
  ))
  .settings(BuildSettings.buildSettings)
  .settings(BuildSettings.formattingSettings)
  .settings(Seq(
    shellPrompt := { _ =>
      name.value + " > "
    }
  ))
  .settings(
    libraryDependencies ++= Seq(
      Dependencies.Libraries.scalajHttp,
      Dependencies.Libraries.igluCore,
      Dependencies.Libraries.circe,
      Dependencies.Libraries.igluCoreCirce,
      Dependencies.Libraries.mockito,
      Dependencies.Libraries.specs2,
      Dependencies.Libraries.scalaCheck,
      Dependencies.Libraries.circeOptics
    )
  )
