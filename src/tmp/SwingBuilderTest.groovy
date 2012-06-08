//package tmp
//
//import groovy.swing.SwingBuilder
//import org.jfxtras.scene.layout.MigLayout
//
//count = 0
//new SwingBuilder().edt {
//  frame(title:'Frame', size:[300,300], show: true, layout: new MigLayout()) {
//    borderLayout()
//    textlabel = label(text:"Click the button!", constraints: "south")
//    button(text:'Click Me',
//         actionPerformed: {count++; textlabel.text = "Clicked ${count} time(s)."; println "clicked"},
//         constraints: "north")
//  }
//}
