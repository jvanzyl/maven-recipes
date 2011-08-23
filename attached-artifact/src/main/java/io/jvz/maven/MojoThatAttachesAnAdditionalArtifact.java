package io.jvz.maven;

/*******************************************************************************
 * Copyright (c) 2010-2011 Jason van Zyl
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.project.MavenProject;
import org.apache.maven.project.MavenProjectHelper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * A {@link org.apache.maven.plugin.Mojo} that creates an archive and attaches it to the {@link org.apache.maven.project.MavenProject} for 
 * subsequent installation into the local repository, and deployment into the remote repository.
 * 
 * @goal attach
 * @phase package
 */
public class MojoThatAttachesAnAdditionalArtifact extends AbstractMojo {

  /** @parameter expression="${project}" */
  private MavenProject project;
  
  /** @parameter */
  private File resourcesArchive;

  /** @parameter */
  private MavenProjectHelper projectHelper;
  
  public void execute() throws MojoExecutionException {
    projectHelper.attachArtifact(project, resourcesArchive, "resources");    
  }
}
