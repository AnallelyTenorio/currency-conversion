package com.aluracursos.coinconverter.principal.modelos;

public record ConvertidorApi(String base_code, String target_code, Float conversion_rate,
                             Float conversion_result) {
}
