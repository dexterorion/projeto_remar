package projetoremar

class ProcessoJogo {
    static belongsTo = [professor: Usuario]

    String id_process_definition
    //String key_process_definition
    String id_process_instance
}
