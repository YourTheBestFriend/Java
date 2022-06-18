<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="/">
       <html>
       <head>
       <title>PowerTools</title>
       </head>
       <body><table border="1">
       <tr>
           <th>model</th>
           <th>handy</th>
           <th>origin</th>
           <tr>
               <th>UseAnergy</th>
               <th>Perfomance</th>
           </tr>
           <th>material</th>
       </tr>
       <xsl:for-each select="PowerTools/PowerTools">
       <tr>
           <td><xsl:value-of select="@model"/></td>
           <td><xsl:value-of select="handy"/></td>
           <td><xsl:value-of select="origin"/></td>
           <td><xsl:value-of select="ts/UseAnergy"/></td>
           <td><xsl:value-of select="ts/Perfomance"/></td>
           <td><xsl:value-of select="material"/></td>
       </tr>
       </xsl:for-each>
       </table>
       </body>
       </html>
       </xsl:template>
       </xsl:stylesheet>