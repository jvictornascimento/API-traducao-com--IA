package com.jnascimento.cafeIntelectual.services;

import com.google.cloud.vertexai.VertexAI;
import com.google.cloud.vertexai.api.GenerateContentResponse;
import com.google.cloud.vertexai.generativeai.GenerativeModel;
import com.google.cloud.vertexai.generativeai.ResponseHandler;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public class GeminiService {
    private final String projectId = System.getenv("PROJECT_ID");
    private final String location = "us-central1";
    private final String modelName = "gemini-1.5-flash-001";
    private String textPrompt = " Poderia me traduzir esse texto em portugues Br, e me devolver somente ele: ";

    //String output = textInput(projectId, location, modelName, textPrompt);


public String traducao(String text) {
    try (VertexAI vertexAI = new VertexAI(projectId, location)) {
        GenerativeModel model = new GenerativeModel(modelName, vertexAI);

        GenerateContentResponse response = model.generateContent(textPrompt + text);
        return ResponseHandler.getText(response);
    }catch (IOException e){
        System.out.println(e.getMessage());
    }
    return text;
}
}
