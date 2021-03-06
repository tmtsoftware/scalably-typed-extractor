scalaVersion := "2.12.10"
version := "0.1.0-SNAPSHOT"

enablePlugins(ExtractorPlugin)

stRepo := file("/Users/mushtaqahmed/projects/cloned/Distribution")

stModules ++= Seq(
  ScalablyTyped.E.eventsource,
  ScalablyTyped.C.`csw-aas-js`,
  ScalablyTyped.R.`rsocket-websocket-client`,
//  ScalablyTyped.R.`react`,
//  ScalablyTyped.R.`react-dom`,
//  ScalablyTyped.S.`svg_dot_js`,
//  ScalablyTyped.P.p5,
//  ScalablyTyped.P.paper,
//  ScalablyTyped.R.`react-facade`,
//  ScalablyTyped.M.`material-ui__core`,
//  ScalablyTyped.M.`material-ui__icons`,
)
