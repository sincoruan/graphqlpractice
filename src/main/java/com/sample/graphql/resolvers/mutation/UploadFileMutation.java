package com.sample.graphql.resolvers.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import graphql.schema.DataFetchingEnvironment;
import graphql.servlet.DefaultGraphQLServlet;
import graphql.servlet.context.DefaultGraphQLServletContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class UploadFileMutation implements GraphQLMutationResolver {
    public UUID uploadFile(DataFetchingEnvironment environment) {
        log.info("uploading file...");

        DefaultGraphQLServletContext defaultGraphQLServletContext = environment.getContext();

        defaultGraphQLServletContext.getFileParts().forEach(part-> log.info("uploading {}", part.getSubmittedFileName()));
        return UUID.randomUUID();
    }
}
