/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.cloud.tools.crepecake.blob;

import com.google.cloud.tools.crepecake.image.DescriptorDigest;
import com.google.cloud.tools.crepecake.image.DigestException;
import com.google.common.io.ByteStreams;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.NoSuchAlgorithmException;

/** A read-only {@link OutputStream} for BLOBs. */
public interface BlobStream {

  /**
   * Writes the BLOB to an {@link OutputStream}.
   *
   * @param outputStream the {@link OutputStream} to write to
   * @return a {@link BlobDescriptor} describing the written BLOB
   */
  BlobDescriptor writeTo(OutputStream outputStream) throws IOException, NoSuchAlgorithmException, DigestException;
}
