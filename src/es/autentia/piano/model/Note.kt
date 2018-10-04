package es.autentia.piano.model

data class Note(var id:Int, var simpleNote:SimpleNote, var sharp:Boolean, var height:Int){

    override fun toString(): String {
        return if(this.sharp) simpleNote.toString()+"#" else simpleNote.toString();
    }
}